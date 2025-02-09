import Application;
import editor.Editor;

public class PasteCommand extends Command {
    private String selectionBackup;

    public PasteCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public void execute() {
        super.execute();
        editor.replaceSelection(app.getClipboard());
    }

    @Override
    public void undo() {
        editor.replaceSelection(selectionBackup);
    }

    @Override
    public void saveBackup() {
        selectionBackup = editor.getSelection();
    }
}