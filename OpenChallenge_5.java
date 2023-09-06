import java.util.Scanner;

abstract class GameObject {
	protected int distance;
	protected int x, y;
	public GameObject(int startX, int startY, int distance) {
		this.x = startX;
		this.y = startY;
		this.distance = distance;
	}
	public int getX() { return x; }
	public int getY() { return y; }
	public boolean collide(GameObject p) {
		if(this.x == p.getX() && this.y == p.getY())
			return true;
		else
			return false;
	}
	protected abstract void move();
	protected abstract char getShape();
}

class Bear extends GameObject {
	public Bear(int startX, int startY, int distnace) {
		super(startX, startY, distnace);
	}
	public void move() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >> ");
		String s = scanner.next();
		if (s.equals("a")) {
			this.x -= this.distance;
		}
		else if (s.equals("s")) {
			this.y += this.distance;
		}
		else if (s.equals("d")) {
			this.y -= this.distance;
		}
		else if (s.equals("f")) {
			this.x += this.distance;
		}
		// scanner.close(); // 이거 있으면 오류
	}
	public char getShape() {
		return 'B';
	}
}

class Fish extends GameObject {
	int count = 0;
	public Fish(int startX, int startY, int distnace) {
		super(startX, startY, distnace);
	}
	public void move() {
		if (this.count < 3) { 
			this.count++;
		}
		else {
			int n = (int)(Math.random()*4); // 0 왼 1 아래 2 위 3 오른
			if (n == 0) {
				this.x -=this.distance;
			}
			else if (n == 1) {
				this.y += this.distance;
			}
			else if (n == 2) {
				this.y -= this.distance;
			}
			else if (n == 3) {
				this.x += this.distance;
			}
			if (this.count == 3)
				this.count++;
			else if (this.count == 4)
				this.count = 0;
		}
	}
	public char getShape() {
		return '@';
	}
}

public class OpenChallenge_5 {
	static void print_map (Bear b, Fish f) {
		char[][] m = new char[10][20];	// y x
		
		for (int i=0;i<m.length;i++) {
			for (int j=0;j<m[i].length;j++) {
				if (b.getX() == j && b.getY() == i) 
					m[i][j] = b.getShape();
				else if (f.getX() == j && f.getY() == i)
					m[i][j] = f.getShape();
				else
					m[i][j] = '-';
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Bear bear = new Bear(0, 0, 1);
		Fish fish = new Fish(15, 5, 1);
		System.out.println("** Bear의 Fish 먹기 게임을 시작합니다.**");
		while (true) {
			print_map(bear, fish);
			bear.move();
			fish.move();
			if (bear.collide(fish)) {
				System.out.println("Bear Wins!!");
				break;
			}
		}
	}

}
