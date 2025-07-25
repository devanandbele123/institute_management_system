package com.cjc.ims.app.servicei;

import java.util.Scanner;
import java.util.List;
import com.cjc.ims.app.model.Batch;
import com.cjc.ims.app.model.Course;
import com.cjc.ims.app.model.Faculty;
import com.cjc.ims.app.model.Student;

import java.util.ArrayList;

public class Karvenagar implements Cjc {
	Scanner sc = new Scanner(System.in);

	List<Course> clist = new ArrayList<>();

	@Override
	public void addCourse() {
		Course c = new Course();
		System.out.print("Enter course id :- ");
		int cid = sc.nextInt();
		c.setCid(cid);

		System.out.print("Enter course name :- ");
		String cname1 = sc.next() + sc.nextLine();
		c.setCname(cname1);

		System.out.println();

		clist.add(c);
	}

	@Override
	public void viewCourse() {
		for (Course c : clist) {
			System.out.println("\nCourse id :- " + c.getCid() + "\nCourse name :- " + c.getCname() + "\n");
		}
	}

	List<Faculty> flist = new ArrayList<>();

	@Override
	public void addFaculty() {
		Faculty f = new Faculty();
		System.out.print("Enter facultty id :- ");
		int fid = sc.nextInt();
		f.setFid(fid);

		System.out.print("Enter faculty name :- ");
		String fname = sc.next() + sc.nextLine();
		f.setFname(fname);

		viewCourse();

		System.out.print("Enter course id to select course :- ");
		int courseid = sc.nextInt();

		for (Course c : clist) {
			if (c.getCid() == courseid) {
				f.setCourse(c);
				break;
			}
		}

		System.out.println();

		flist.add(f);

	}

	@Override
	public void viewFaculty() {
		for (Faculty f : flist) {
			System.out.println("\nFaculty id :- " + f.getFid() + "\nfaculty name :- " + f.getFname()
					+ "\nCourse name :-" + f.getCourse().getCname() + "\n");
		}
	}

	List<Batch> blist = new ArrayList<>();

	@Override
	public void addBatch() {
		Batch b = new Batch();
		System.out.print("Enter batch id :- ");
		int bid = sc.nextInt();
		b.setBid(bid);

		System.out.print("Enter batch name :- ");
		String bname = sc.next() + sc.nextLine();
		b.setBname(bname);

		System.out.print("Available Faculty");
		viewFaculty();

		System.out.print("Enter faculty id to select faculty :- ");
		int fid = sc.nextInt();

		for (Faculty f : flist) {
			if (f.getFid() == fid) {
				b.setFaculty(f);
				break;
			}
		}

		blist.add(b);
	}

	@Override
	public void viewBatch() {
		for (Batch b : blist) {
			System.out.println("\nBatch id :- " + b.getBid() + "\nBatch name :- " + b.getBname() + "\nFaculty name :- "
					+ b.getFaculty().getFname()+"\n");
		}
	}

	List<Student> slist = new ArrayList<>();

	@Override
	public void addStudent() {
		Student s = new Student();

		System.out.print("Enter studetn id :- ");
		int sid = sc.nextInt();
		s.setSid(sid);

		System.out.print("Enter studetn name :- ");
		String sname = sc.next() + sc.nextLine();
		s.setSname(sname);

		System.out.print("Available Batches");
		viewBatch();

		System.out.print("Enter batch id to select batch :- ");
		int bid = sc.nextInt();

		for (Batch b : blist) {
			if (b.getBid() == bid) {
				s.setBatch(b);
			}
		}

		slist.add(s);
	}

	@Override
	public void viewStudent() {
		for (Student s : slist) {
			System.out.println("\nStudent id :- " + s.getSid() + "\nStudent name :- " + s.getSname()
					+ "\nBatch name :- " + s.getBatch().getBname()+"\n");
		}
	}
}
