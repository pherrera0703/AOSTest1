import com.borland.silktest.jtf.BrowserBaseState;
import org.junit.Before;
import org.junit.Test;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.common.types.MouseButton;
import com.borland.silktest.jtf.common.types.Point;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomLink;
import com.borland.silktest.jtf.Desktop;

public class shopping {

	private Desktop desktop = new Desktop();

	@Before
	public void baseState() {
		// Go to web page 'http://nimbusserver:8000/#/'
		BrowserBaseState baseState = new BrowserBaseState();
		baseState.execute(desktop);
	}

	@Test
	public void speakers() {
		desktop.<DomElement>find("nimbusserver.BrowserWindow.speakersImg").click(MouseButton.LEFT, new Point(325, 192));
		desktop.<DomElement>find("nimbusserver.BrowserWindow.20").click(MouseButton.LEFT, new Point(149, 81));
		desktop.<DomButton>find("nimbusserver.BrowserWindow.save_to_cart").click(MouseButton.LEFT, new Point(156, 33));
		desktop.<DomElement>find("nimbusserver.BrowserWindow.menuCart").click(MouseButton.LEFT, new Point(13, 8));
		desktop.<DomLink>find("nimbusserver.BrowserWindow.REMOVE").click(MouseButton.LEFT, new Point(18, 12));
		desktop.<DomLink>find("nimbusserver.BrowserWindow.CONTINUE SHOPPING").click(MouseButton.LEFT,
				new Point(121, 26));
	}

}