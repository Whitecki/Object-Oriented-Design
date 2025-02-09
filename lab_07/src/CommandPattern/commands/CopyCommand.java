
import Application;
import editor.Editor;

public class CopyCommand extends Command {
    private String clipboardBackup;

    public CopyCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public void execute() {
        super.execute();
        String selection = editor.getSelection();
        app.setClipboard(selection);
    }

    @Override
    public void undo() {
        app.setClipboard(clipboardBackup);
    }

    @Override
    public void saveBackup() {
        clipboardBackup = app.getClipboard();
    }
}