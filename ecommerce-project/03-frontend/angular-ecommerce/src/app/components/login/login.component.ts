import { Component, OnInit } from '@angular/core';
import { OktaAuthService } from '@okta/okta-angular';
import * as OktaSignIn from '@okta/okta-signin-widget';

import oidcConfig from '../../config/config';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  oktaSignin: any;


  constructor(private oktaAuthService: OktaAuthService) {

    this.oktaSignin = new OktaSignIn({
      logo: 'assets/images/logo.png',
      baseUrl: oidcConfig.oidc.issuer.split('/oauth2')[0],
      clientId: oidcConfig.oidc.clientId,
      redirectUri: oidcConfig.oidc.redirectUri,
      authParams: {
        pkce: true,
        issuer: oidcConfig.oidc.issuer,
        scopes: oidcConfig.oidc.scopes
      }
    });

  }

  ngOnInit(): void {
    this.oktaSignin.remove();

    this.oktaSignin.renderEl(
      {
        el: '#okta-sign-in-widget'  // this name should be same as div tag id in login.component.html
      },
      (response) => {
        if (response.status === 'SUCCESS') {
          this.oktaAuthService.signInWithRedirect();
        }
      },
      (error) => {
        throw error;
      }
    );
  }

}
