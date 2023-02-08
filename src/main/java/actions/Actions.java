package actions;

import org.apache.commons.compress.changes.ChangeSetPerformer;
import org.openqa.selenium.WebElement;

public class Actions {

    protected final WaitStrategy wait = new WaitStrategy();
    protected final MouseActions mouseActions = new MouseActions();
    protected final KeyboardActions keyboardActions = new KeyboardActions();
    protected final BrowserActions browserActions = new BrowserActions();

    public ChangeSetPerformer doubleClick(WebElement ele) {
        return null;
    }
}
