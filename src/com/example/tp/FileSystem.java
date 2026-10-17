package com.example.tp;

	public class FileSystem {
	    private FsItem[] items;
	    private int count;

	    public FileSystem() {
	        this.items = new FsItem[2];
	        this.count = 0;
	    }

	    public void addRoot(FsItem item) {
	        if (count >= items.length) {
	            FsItem[] t = new FsItem[items.length + 2];
	            for (int i = 0; i < items.length; i++) {
	                t[i] = items[i];
	            }
	            items = t;
	        }
	        items[count] = item;
	        count++;
	    }

	    public void listAll() {
	        int i = 0;
	        while (i < count) {
	            FsItem f = items[i];
	            if (f instanceof Directory) {
	                ((Directory) f).list(0);
	            } else {
	                System.out.println(f);
	            }
	            i++;
	        }
	    }

	    public long totalSize() {
	        long sum = 0;
	        int i = 0;
	        while (i < count) {
	            sum += items[i].getSize();
	            i++;
	        }
	        return sum;
	    }
	}


