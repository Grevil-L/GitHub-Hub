
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

public class helperClass {

    public void UpdateGraphic(String current,
            Graphics g, BufferedImage trackg, BufferedImage track1g,
            BufferedImage track3g, BufferedImage track4g,
            ImageObserver c) {

        if (current != null) {
            if (current.equals("S1-1")) {
                g.drawImage(trackg, 40, 40, 80, 20, (ImageObserver) c);
                g.drawImage(trackg, 120, 40, 80, 20, (ImageObserver) c);
            } else if (current.equals("S2-1")) {
                g.drawImage(trackg, 200, 40, 50, 20, (ImageObserver) c);
            } else if (current.equals("S3-1")) {
                g.drawImage(trackg, 250, 40, 80, 20, (ImageObserver) c);
                g.drawImage(trackg, 330, 40, 70, 20, (ImageObserver) c);
            } else if (current.equals("S4-1")) {
                g.drawImage(trackg, 450, 40, 50, 20, (ImageObserver) c);
            } else if (current.equals("S4-2")) {
                g.drawImage(trackg, 450, 90, 50, 20, (ImageObserver) c);
            } else if (current.equals("S5-1")) {
                g.drawImage(trackg, 550, 40, 50, 20, (ImageObserver) c);
            } else if (current.equals("S5-2")) {
                g.drawImage(trackg, 550, 90, 70, 20, (ImageObserver) c);
            } else if (current.equals("S6-1")) {
                g.drawImage(trackg, 600, 40, 40, 20, (ImageObserver) c);
                g.drawImage(track1g, 645, 45, 20, 80, (ImageObserver) c);
                g.drawImage(track1g, 645, 120, 20, 80, (ImageObserver) c);
            } else if (current.equals("S6-2")) {
                g.drawImage(track1g, 615, 90, 20, 80, (ImageObserver) c);
                g.drawImage(track4g, 625, 175, 10, 20, (ImageObserver) c);	// 6-2
                g.drawImage(track4g, 630, 180, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 635, 185, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 640, 190, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 645, 195, 10, 20, (ImageObserver) c);
            } else if (current.equals("S7-1")) {
                g.drawImage(track1g, 645, 200, 20, 50, (ImageObserver) c);
                g.drawImage(trackg, 600, 240, 50, 20, (ImageObserver) c);

            } else if (current.equals("S8-1")) {
                g.drawImage(track4g, 550, 195, 10, 20, (ImageObserver) c);	// 8-1
                g.drawImage(track4g, 555, 200, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 560, 205, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 565, 210, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 570, 215, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 575, 220, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 580, 225, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 585, 230, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 590, 235, 10, 20, (ImageObserver) c);

                g.drawImage(trackg, 400, 190, 80, 20, (ImageObserver) c);	// 8-1
                g.drawImage(trackg, 480, 190, 70, 20, (ImageObserver) c);	// 8-1

                g.drawImage(track3g, 355, 235, 10, 20, (ImageObserver) c);	// 8-1
                g.drawImage(track3g, 360, 230, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 365, 225, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 370, 220, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 375, 215, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 380, 210, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 385, 205, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 390, 200, 10, 20, (ImageObserver) c);
            } else if (current.equals("S8-2")) {
                g.drawImage(trackg, 350, 240, 80, 20, (ImageObserver) c);
                g.drawImage(trackg, 430, 240, 80, 20, (ImageObserver) c);
                g.drawImage(trackg, 510, 240, 90, 20, (ImageObserver) c);

            } else if (current.equals("S9-1")) {
                g.drawImage(trackg, 300, 240, 50, 20, (ImageObserver) c);
            } else if (current.equals("S10-1")) {
                g.drawImage(trackg, 50, 240, 80, 20, (ImageObserver) c);
                g.drawImage(trackg, 130, 240, 80, 20, (ImageObserver) c);
                g.drawImage(trackg, 210, 240, 90, 20, (ImageObserver) c);
            } else if (current.equals("S10-2")) {
                g.drawImage(trackg, 100, 290, 80, 20, (ImageObserver) c);
                g.drawImage(trackg, 180, 290, 70, 20, (ImageObserver) c);

                g.drawImage(track3g, 250, 285, 10, 20, (ImageObserver) c);	// 10-2
                g.drawImage(track3g, 255, 280, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 260, 275, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 265, 270, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 270, 265, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 275, 260, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 280, 255, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 285, 250, 10, 20, (ImageObserver) c);

                g.drawImage(track4g, 60, 250, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 65, 255, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 70, 260, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 75, 265, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 80, 270, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 85, 275, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 90, 280, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 95, 285, 10, 20, (ImageObserver) c);
            } else if (current.equals("S11-1")) {
                g.drawImage(track1g, 35, 250, 20, 100, (ImageObserver) c);	// 11-1
            } else if (current.equals("S12-1")) {
                g.drawImage(trackg, 35, 345, 80, 20, (ImageObserver) c);	// 11-1
                g.drawImage(trackg, 115, 345, 80, 20, (ImageObserver) c);	// 11-1
                g.drawImage(trackg, 195, 345, 80, 20, (ImageObserver) c);	// 11-1
                g.drawImage(trackg, 175, 345, 80, 20, (ImageObserver) c);	// 11-1
                g.drawImage(trackg, 255, 345, 100, 20, (ImageObserver) c);	// 11-1
            } else if (current.equals("S18-1")) {
                g.drawImage(track1g, 350, 345, 20, 20, (ImageObserver) c);	// 18-1
            } else if (current.equals("S19-1")) {
                g.drawImage(trackg, 370, 345, 100, 20, (ImageObserver) c);	// 19-1
                g.drawImage(trackg, 470, 345, 110, 20, (ImageObserver) c);	// 19-1
            } else if (current.equals("S19-2")) {
                g.drawImage(trackg, 400, 395, 75, 20, (ImageObserver) c);	// 18-1
                g.drawImage(trackg, 475, 395, 75, 20, (ImageObserver) c);	// 18-1

                g.drawImage(track4g, 370, 350, 10, 20, (ImageObserver) c);	// 19-2
                g.drawImage(track4g, 373, 355, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 376, 360, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 379, 365, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 382, 370, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 385, 375, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 388, 380, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 391, 385, 10, 20, (ImageObserver) c);

                g.drawImage(track3g, 553, 390, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 556, 385, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 559, 380, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 562, 375, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 565, 370, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 568, 365, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 571, 360, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 574, 355, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 577, 350, 10, 20, (ImageObserver) c);
            } else if (current.equals("S20-1")) {
                g.drawImage(trackg, 580, 345, 40, 20, (ImageObserver) c);	// 20-1
                g.drawImage(track1g, 620, 355, 20, 80, (ImageObserver) c);	// 20-1
            } else if (current.equals("S21-1")) {
                g.drawImage(track1g, 620, 445, 20, 70, (ImageObserver) c);	// 20-1
                g.drawImage(trackg, 600, 500, 30, 20, (ImageObserver) c);	// 20-1
            } else if (current.equals("S22-1")) {
                g.drawImage(track4g, 550, 445, 10, 20, (ImageObserver) c);	// 22-1
                g.drawImage(track4g, 555, 450, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 560, 455, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 565, 460, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 570, 465, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 575, 470, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 580, 475, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 585, 480, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 590, 485, 10, 20, (ImageObserver) c);

                g.drawImage(trackg, 450, 440, 100, 20, (ImageObserver) c);

                g.drawImage(track3g, 400, 490, 10, 20, (ImageObserver) c);	// 22-1
                g.drawImage(track3g, 405, 485, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 410, 480, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 415, 475, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 420, 470, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 425, 465, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 430, 460, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 435, 455, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 440, 450, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 435, 455, 10, 20, (ImageObserver) c);
            } else if (current.equals("S22-2")) {
                g.drawImage(trackg, 400, 495, 100, 20, (ImageObserver) c);	// 20-1
                g.drawImage(trackg, 500, 495, 100, 20, (ImageObserver) c);	// 20-1
            } else if (current.equals("S23-1")) {
                g.drawImage(trackg, 350, 495, 50, 20, (ImageObserver) c);	// 23-1
            } else if (current.equals("S24-1")) {
                g.drawImage(track3g, 300, 540, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 305, 535, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 310, 530, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 315, 525, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 320, 520, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 325, 515, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 330, 510, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 335, 505, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 340, 500, 10, 20, (ImageObserver) c);

                g.drawImage(trackg, 280, 540, 20, 20, (ImageObserver) c);
            } else if (current.equals("S25-2")) {
                g.drawImage(trackg, 75, 540, 100, 20, (ImageObserver) c);
                g.drawImage(trackg, 180, 540, 100, 20, (ImageObserver) c);
            } else if (current.equals("S25-3")) {
                g.drawImage(track3g, 250, 580, 10, 20, (ImageObserver) c);	// 25-3
                g.drawImage(track3g, 255, 575, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 260, 570, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 265, 565, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 270, 560, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 275, 555, 10, 20, (ImageObserver) c);
                g.drawImage(track3g, 280, 550, 10, 20, (ImageObserver) c);

                g.drawImage(trackg, 100, 582, 75, 20, (ImageObserver) c);
                g.drawImage(trackg, 175, 582, 75, 20, (ImageObserver) c);

                g.drawImage(track4g, 80, 550, 10, 20, (ImageObserver) c);	// 25-3
                g.drawImage(track4g, 83, 555, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 86, 560, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 89, 565, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 92, 570, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 95, 575, 10, 20, (ImageObserver) c);
            } else if (current.equals("S26-1")) {
                g.drawImage(trackg, 45, 540, 30, 20, (ImageObserver) c);
                g.drawImage(trackg, 50, 630, 40, 20, (ImageObserver) c);
                g.drawImage(track1g, 45, 545, 20, 90, (ImageObserver) c);
            } else if (current.equals("S27-1")) {
                g.drawImage(trackg, 80, 630, 80, 20, (ImageObserver) c);
                g.drawImage(trackg, 160, 630, 80, 20, (ImageObserver) c);
                g.drawImage(trackg, 240, 630, 80, 20, (ImageObserver) c);
                g.drawImage(trackg, 320, 630, 80, 20, (ImageObserver) c);
            } else if (current.equals("S28-1")) {
                g.drawImage(trackg, 400, 630, 50, 20, (ImageObserver) c);
            } else if (current.equals("S29-1")) {
                g.drawImage(trackg, 450, 630, 75, 20, (ImageObserver) c);
                g.drawImage(trackg, 525, 630, 75, 20, (ImageObserver) c);
            } else if (current.equals("S29-2")) {
                g.drawImage(track4g, 480, 640, 10, 20, (ImageObserver) c);	// 29-2
                g.drawImage(track4g, 485, 645, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 490, 650, 10, 20, (ImageObserver) c);
                g.drawImage(track4g, 495, 655, 10, 20, (ImageObserver) c);
                g.drawImage(trackg, 500, 660, 100, 20, (ImageObserver) c);
            }
        }
    }
}
