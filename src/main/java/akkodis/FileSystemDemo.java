package akkodis;

public class FileSystemDemo {

	 public static void main(String[] args) {
	        Folder root = new Folder("root", null);
	        Folder docs = new Folder("Documents", root);
	        Folder pics = new Folder("Pictures", root);
	        
	        File file1 = new File("resume.pdf", 120, docs);
	        File file2 = new File("photo1.jpg", 500, pics);
	        File file3 = new File("photo2.png", 750, pics);

	        root.add(docs);
	        root.add(pics);
	        docs.add(file1);
	        pics.add(file2);
	        pics.add(file3);

	        root.list();
	        docs.list();
	        pics.list();

	        System.out.println("\nTotal size of root: " + root.getSize() + " KB");
	        pics.remove("photo1.jpg");
	        pics.list();
	    }
}
