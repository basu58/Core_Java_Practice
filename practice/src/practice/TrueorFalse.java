package practice;



public class TrueorFalse {
	  public static void main(String[] args) {
	    Personal john = new Personal("John", true, false, 1, 0);
	    Personal mary = new Personal("Mary", false, true, 0, 3);
	    Personal olivia = new Personal("Olivia", true, true, 0, 2);
	    Personal alex = new Personal("Alex", true, true, 3, 2);
	    Personal andrey = new Personal("Andrew", false, false, 1, 1);
	    Personal emily = new Personal("Emily", false, true, 0, 2);

	    Personal[] list = {john, mary, olivia, alex, andrey, emily};

	    for (Personal each : list) {
	      System.out.println(each.getName() + ": " + Personal.offerAJob(each));
	    }
	  }
	}

	class Personal {
	  private String nameCandidate;
	  private boolean knowJava;
	  private boolean knowPython;
	  private int yearsOfExperienceInJava;
	  private int yearsOfExperienceInPython;

	  Personal(String name, boolean java, boolean python, int expJava, int expPython) {
	    nameCandidate = name;
	    knowJava = java;
	    knowPython = python;
	    yearsOfExperienceInJava = expJava;
	    yearsOfExperienceInPython = expPython;
	  }

	  static boolean offerAJob(Personal candidate) {
	    return (candidate.knowJava && candidate.yearsOfExperienceInJava >= 1) ||
	            (candidate.knowPython && candidate.yearsOfExperienceInPython >= 3);
	  }

	  String getName() {
	    return nameCandidate;
	  }
	}
