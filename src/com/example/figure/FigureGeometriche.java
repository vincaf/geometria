package com.example.figure;

import java.math.BigDecimal;

public abstract class FigureGeometriche implements Misurabile {

	public static int versioneSoftware = 1;

	public abstract double area();
	public abstract double perimetro();

}
