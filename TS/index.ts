import { AccountTS } from "./AccountTS";
import { CarTS } from "./CarTS";

const carTS = new CarTS("TIPO A", new AccountTS("Andy Velez", "AVW-001"));
carTS.setPassenger(4);
carTS.printDataCar();