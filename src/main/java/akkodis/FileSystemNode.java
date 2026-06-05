package akkodis;

import java.util.ArrayList;
import java.util.List;

// 🔹 Abstract Base Class
abstract class FileSystemNode {
	 String name;
	    Folder parent;

	    FileSystemNode(String name, Folder parent) {
	        this.name = name;
	        this.parent = parent;
	    }

	    abstract int getSize();
	    abstract boolean isDirectory();

	    String getPath() {
	        if (parent == null) return name;
	        return parent.getPath() + "/" + name;
	    }
}

// 🔹 File class
class File extends FileSystemNode {
	private int size;

    File(String name, int size, Folder parent) {
        super(name, parent);
        this.size = size;
    }

    @Override
    int getSize() {
        return size;
    }

    @Override
    boolean isDirectory() {
        return false;
    }

    @Override
    public String toString() {
        return "File: " + name + " (" + size + " KB)";
    }
}

// 🔹 Folder class
class Folder extends FileSystemNode {
	 private List<FileSystemNode> children = new ArrayList<>();

	    Folder(String name, Folder parent) {
	        super(name, parent);
	    }

	    // Add a file or folder
	    public void add(FileSystemNode node) {
	        children.add(node);
	    }

	    // Remove a file or folder by name
	    public boolean remove(String name) {
	        return children.removeIf(n -> n.name.equals(name));
	    }

	    // List contents
	    public void list() {
	        System.out.println("Contents of folder: " + getPath());
	        for (FileSystemNode node : children) {
	            System.out.println("  - " + (node.isDirectory() ? "[DIR] " : "[FILE] ") + node.name);
	        }
	    }

	    @Override
	    int getSize() {
	        int totalSize = 0;
	        for (FileSystemNode node : children) {
	            totalSize += node.getSize();
	        }
	        return totalSize;
	    }

	    @Override
	    boolean isDirectory() {
	        return true;
	    }

	    @Override
	    public String toString() {
	        return "Folder: " + name + " (" + children.size() + " items, " + getSize() + " KB total)";
	    }
}

