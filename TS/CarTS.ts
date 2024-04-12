class CarTS {
  private id: number;
  private license: string;
  private driver: AccountTS;
  private passenger: number;

  constructor(license: string, driver: AccountTS) {
    this.license = license;
    this.driver = driver;
  }

  public printDataCar(): void {
    if (this.passenger == null) return console.log(this);
    console.log(this.driver);
    console.log(this.driver.name);
    console.log(this.driver.document);
  }

  public getPassenger(): number {
    return this.passenger;
  }

  public setPassenger(passenger: number): void {
    if (passenger == 4) {
      this.passenger = passenger;
    } else {
      console.log("Necesitas asignar 4 pasajeros");
    }
  }

  public getId(): number {
    return this.id;
}

public setId(id: number): void {
    this.id = id;
}

public getLicense(): string {
    return this.license;
}

public setLicense(license: string): void {
    this.license = license;
}

public getDriver(): AccountTS {
    return this.driver;
}

public setDriver(driver: AccountTS): void {
    this.driver = driver;
}
}
