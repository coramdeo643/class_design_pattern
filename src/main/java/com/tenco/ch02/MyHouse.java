package com.tenco.ch02;

// Target, Interface
interface IElectronic220v {
	void connect();
}

interface IElectronic110v {
	void connect();
}

// Japanese Hair Dryer
class HairDryer implements IElectronic110v {
	@Override
	public void connect() {
		System.out.println("HairDryer(110V) is connected, and turn on");
	}
}

class AirConditioner implements IElectronic220v {
	@Override
	public void connect() {
		System.out.println("AirConditioner(220V) is connected, and turn on");
	}
}

// Adapter
class ElectronicAdapter implements IElectronic220v{

	IElectronic110v iElectronic110v;

	public ElectronicAdapter(IElectronic110v iElectronic110v) {
		this.iElectronic110v = iElectronic110v;
	}

	// External 220v connection is available, but 110v connection is needed
	@Override
	public void connect() {
		iElectronic110v.connect();
	}
}

// Client
public class MyHouse {
	// 220V
	public static void plugin(IElectronic220v iElectronic220v) {
		iElectronic220v.connect();
	}

	public static void main(String[] args) {
		AirConditioner airConditioner = new AirConditioner();
		HairDryer hairDryer = new HairDryer();

		ElectronicAdapter electronicAdapterHairDryer = new ElectronicAdapter(hairDryer);

		plugin(airConditioner);
		plugin(electronicAdapterHairDryer);
	}
}
