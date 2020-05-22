package oca.cap4.my.city;

import oca.cap4.my.school.*;

public class _07School {
	public static void main(String[] args) {
		//System.out.println(_07Classroom.globalKey);					//No compila el campo no es visible, porque está definido con el modificador default=acceso dentro del mismo paquete
		//_07Classroom room = new _07Classroom(101, "Mrs. Anderson");	//No compila el constructor no es visible????, porque está definido con el modificador default=acceso dentro del mismo paquete

		//System.out.println(room.roomNumber);		//No compila el campo no es visible, porque está definido con el modificador private=acceso dentro de la misma clase
		//System.out.println(room.floor);			//Puede acceder por ser un campo definido como public, pero la instancia no puede ser creada
		//System.out.println(room.teacherName);		//No compila el campo no es visible, porque está definido con el modificador protected=acceso dentro del mismo paquete o subclase
	}
}
