import { Component, OnInit } from '@angular/core';
import { SalesPerson } from './sales-person';

@Component({
  selector: 'app-sales-person-list',
  templateUrl: './sales-person-list-bootstrap.component.html',
  styleUrls: ['./sales-person-list.component.css']
})
export class SalesPersonListComponent implements OnInit {

  salesPersonList: SalesPerson[] = [
    new SalesPerson("Hans", "Muster", "abc@bluewin.ch", 50000),
    new SalesPerson("Kevin", "Quacker", "efg@bluewin.ch", 40000),
    new SalesPerson("Karl", "Trümmel", "hij@bluewin.ch", 90000),
    new SalesPerson("Franz", "Kümmel", "klm@bluewin.ch", 60000)
  ];

  constructor() { }

  ngOnInit(): void {
  }

}
