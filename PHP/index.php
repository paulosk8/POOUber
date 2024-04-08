<?php
require_once("./Car.php");
require_once("./uberX.php");
require_once("./Account.php");

$uberX = new uberX("Tipo A", new Account("Paulo Galarza", "PCG-002"), "Mazda", "Mazda 2");
$uberX->printDataCar();
