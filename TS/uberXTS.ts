class uberXTS extends CarTS {
    brand: string;
    model: string;

    constructor(license: string, driver: AccountTS, brand: string, model: string){
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }
}