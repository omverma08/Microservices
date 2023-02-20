package java8;

class MyRunnable implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");

		}
	}

}

class ThreadDemo {

	public static void main(String[] args) {

		Runnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");

		}

	}
}


class ThreadDemo2 {

	public static void main(String[] args) {
		Runnable r = () -> {
			for (int i = 0; i < 4; i++) {
				System.out.println("child thread "+i);

			}
		};

		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i < 2; i++) {
			System.out.println("main thread "+i);

		}
	}
}