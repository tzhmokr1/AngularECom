"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Customer4_1 = require("./Customer4");
var myCustomer4 = new Customer4_1.Customer4("Kristian", "Morath");
console.log(myCustomer4.firstName);
console.log(myCustomer4.lastName);
myCustomer4.firstName = "Susan";
console.log(myCustomer4.firstName);
