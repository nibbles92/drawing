package drawingView;

import javax.swing.JFrame;

import drawingController.DrawingController;
public class DrawingFrame extends JFrame
	{
		private DrawingController baseController;
		private DrawingPanel basePanel;
		
		public DrawingFrame(DrawingController baseController)
		{
			this.baseController = baseController;
			basePanel = new DrawingPanel(baseController);
			
			buildFrame();
		}
		
		private void buildFrame()
		{
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setContentPane(basePanel);
			setSize(700,700);
			setTitle("Drawing a Rectangle");
			setVisible(false);
		}
	}

