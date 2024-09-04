package com.huidos22.algoritmos.java17;

public sealed class Truck implements ServiceCar permits TeslaTruck {

	@Override
	public int getMaxServiceIntervalInMonths() {
		// TODO Auto-generated method stub
		return 0;
	}

}
