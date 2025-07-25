package com.cjc.ims.app.client;

import java.util.Scanner;

import com.cjc.ims.app.servicei.Karvenagar;

public class Test {

	public static void main(String[] args) {
		Karvenagar k = new Karvenagar();
		Scanner sc = new Scanner(System.in);

		
		do {
			System.out.println("---Select---\n" + "1. Add Course\n" + "2. Show Course\n" + "3. Add Faculty\n"
					+ "4. Show Faculty\n" + "5. Add Batch\n" + "6. Show Batch\n" + "7. Add Student\n"
					+ "8. Show Studetn\n" + "9. Show all details\n" + "0. Exit");
			int ch = sc.nextInt();
			if (ch == 1) {
				k.addCourse();
			} else if (ch == 2) {
				k.viewCourse();
			} else if (ch == 3) {
				k.addFaculty();
			} else if (ch == 4) {
				k.viewFaculty();
			} else if (ch == 5) {
				k.addBatch();
			} else if (ch == 6) {
				k.viewBatch();
			} else if (ch == 7) {
				k.addStudent();
			} else if (ch == 8) {
				k.viewStudent();
			} else if (ch == 9) {
				k.viewCourse();
				k.viewFaculty();
				k.viewBatch();
				k.viewStudent();
			}

		} while (true);

	}

}
