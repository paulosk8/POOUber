class AccountTS {
    public id: number;
    public name: string;
    public document: string;
    public email: string;
    public password: string;

    constructor(name: string, document: string) {
        this.name = name;
        this.document = document;
    }
}