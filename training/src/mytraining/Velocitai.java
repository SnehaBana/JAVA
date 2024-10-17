package mytraining;

import allotherinfooftraining.Fee;
import allotherinfooftraining.HRdept;
import allotherinfooftraining.Trainers;
import jspider.JavaDeveloper;
import pyspider.PythonDeveloper;
import qspider.Fullstack;

public class Velocitai {
		public static void main(String[] args) {
			Fullstack a = new Fullstack();
			String s = a.java("part1 +", "part2 +", "part3");
			
			System.out.println(s);
			System.out.println(Fullstack.sql("All"));
			System.out.println(Fullstack.webtech("HTML+", "CSS+", "JS"));
			
			PythonDeveloper b = new PythonDeveloper();
			System.out.println(b.python("All syllabus"));
			
			JavaDeveloper c = new JavaDeveloper();
			System.out.println(c.java("part 1 +", "Part 2 +", "Part 3"));
			System.out.println(JavaDeveloper.advancejava("Java +", "Advance Java"));
			
			Fee d = new Fee();
			System.out.println(d.feestructure(10000, 23000, 1800));
			
			HRdept e = new HRdept();
			System.out.println(e.hr("Admission ", "Requirements"));
			
		
			System.out.println(Trainers.name("Debasis ,", "Harshal ,", "Hemant ", "Anvith,"));
		}
}
