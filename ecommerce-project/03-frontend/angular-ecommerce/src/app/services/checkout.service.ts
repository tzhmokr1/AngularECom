import { environment } from 'src/environments/environment';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Purchase } from '../dto/purchase';
import { PaymentInfo } from '../dto/payment-info';


@Injectable({
  providedIn: 'root'
})
export class CheckoutService {

  private purchaseUrl = environment.shopApiUrl + '/checkout/purchase';
  private paymentIntentUrl = environment.shopApiUrl + '/checkout/payment-intent';

  constructor(private httpClient: HttpClient) { }


  placeOrder(purchase: Purchase): Observable<any> {
    return this.httpClient.post<Purchase>(this.purchaseUrl, purchase);
  }

  createPaymentIntent(paymentInfo: PaymentInfo): Observable<any> {
    return this.httpClient.post<PaymentInfo>(this.paymentIntentUrl, paymentInfo);
  }

}
