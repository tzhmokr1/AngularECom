"use strict";
var Customer3 = /** @class */ (function () {
    function Customer3(theFirst, theLast) {
        this._firstName = theFirst;
        this._lastName = theLast;
    }
    Object.defineProperty(Customer3.prototype, "firstName", {
        get: function () {
            return this._firstName;
        },
        set: function (value) {
            this._firstName = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Customer3.prototype, "lastName", {
        get: function () {
            return this._lastName;
        },
        set: function (value) {
            this._lastName = value;
        },
        enumerable: false,
        configurable: true
    });
    return Customer3;
}());
var myCustomer3 = new Customer3("Kristian", "Morath");
console.log(myCustomer3.firstName);
console.log(myCustomer3.lastName);
myCustomer3.firstName = "Susan";
console.log(myCustomer3.firstName);
