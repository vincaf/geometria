package com.example.utilizzatori;

import com.example.figure.Cerchio;
import com.example.figure.FigureGeometriche;
import com.example.figure.Quadrato;
import com.example.figure.Rettangolo;

public class UtilizzatoreFigureGeometriche {

	public static void main(String[] args) {

		Cerchio c = new Cerchio(10);
		String str = String.format("Cerchio area=%s perimetro=%s", c.area(), c.perimetro());
		System.out.println(str);

		Rettangolo r = new Rettangolo(10, 20);
		str = String.format("Rettangolo area=%s perimetro=%s", r.area(), r.perimetro());
		System.out.println(str);

		Quadrato q = new Quadrato(12);
		str = String.format("Quadrato area=%s perimetro=%s", q.area(), q.perimetro());
		System.out.println(str);

		r = new Quadrato(5);
		str = String.format("Rettangolo creato da Quadrato area=%s perimetro=%s", r.area(), r.perimetro());
		System.out.println(str);

		// POLIMORFISMO uso una classe di alto livello però ottenendo il comportamento di una sottoclasse
		FigureGeometriche fg = new Rettangolo(5, 7); // UPCASTING = conversione di tipo (verso l'alto) da figlio a padre (sempre garantita)
		str = String.format("Polimorfismo FigureGeometriche creato da Rettangolo area=%s perimetro=%s", fg.area(), fg.perimetro());
		System.out.println(str);

		// operazione sul reference di "new Rettangolo(5, 7)"
		FigureGeometriche fgx = fg; // copia il reference in un'altra variabile, quindi il reference count=2
		fg = null; // butta via il reference, quindi il reference count=1
		fgx = null; // butta via il reference, quindi il reference count=0

		r = (Rettangolo /* cast esplicito */) fg; // DOWNCASTING, non è mai garantita, deve essere esplicita ed è pericolosa
		str = String.format("Rettangolo creato da Quadrato area=%s perimetro=%s", r.area(), r.perimetro());
		System.out.println(str);

		/* segmento di codice errato
		fg = c;
		r = (Rettangolo) fg;
		str = String.format("Rettangolo creato da Quadrato area=%s perimetro=%s", r.area(), r.perimetro());
		System.out.println(str);
		*/



	}

}
