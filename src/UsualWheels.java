import java.awt.Color;
import java.awt.Graphics;

public class UsualWheels implements IWheels {

	static int _startPosX;
	static int _startPosY;
	private Color ColorWheels;

	public UsualWheels(Color colorwheel) {
		ColorWheels = colorwheel;
	}

	public void SetPosition(int x, int y) {
		_startPosX = x;
		_startPosY = y;
	}

	public void DrawWheels(Graphics g, int countWheels) {
		int x = 0;
		g.setColor(ColorWheels);
		g.fillRect(_startPosX + 382, _startPosY + 35, 15, 20);
		g.fillRect(_startPosX + 382, _startPosY + 75, 15, 20);
		g.setColor(Color.BLACK);
        g.drawRect(_startPosX + 382, _startPosY + 35, 15, 20);
        g.drawRect(_startPosX + 382, _startPosY + 75, 15, 20);
        
		for (int i = 1; i < countWheels; i++) {
			g.setColor(ColorWheels);
			g.fillRect(_startPosX + 240 + x, _startPosY + 35, 20, 20);
			g.fillRect(_startPosX + 240 + x, _startPosY + 75, 20, 20);
			g.setColor(Color.BLACK);
            g.drawRect(_startPosX + 240 + x, _startPosY + 35, 20, 20);
            g.drawRect(_startPosX + 240 + x, _startPosY + 75, 20, 20);
            x+=22;
		}
	}

	public void Draw(Graphics g, WheelsNum temp) {
		int countWheels = 0;
		switch (temp) {
		case wheels2:
			countWheels = 2;
			break;
		case wheels3:
			countWheels = 3;
			break;
		case wheels4:
			countWheels = 4;
			break;
		}
		DrawWheels(g, countWheels);
	}
}