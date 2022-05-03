class Customer3 {

    private _firstName: string;
    private _lastName: string;
    
    constructor(theFirst: string, theLast: string) {
        this._firstName = theFirst;
        this._lastName = theLast;
    }

    get firstName(): string {
        return this._firstName;
    }
    set firstName(value: string) {
        this._firstName = value;
    }

    public get lastName(): string {
        return this._lastName;
    }
    public set lastName(value: string) {
        this._lastName = value;
    }
}


let myCustomer3 = new Customer3("Kristian", "Morath");
console.log(myCustomer3.firstName);
console.log(myCustomer3.lastName);

myCustomer3.firstName = "Susan";
console.log(myCustomer3.firstName);