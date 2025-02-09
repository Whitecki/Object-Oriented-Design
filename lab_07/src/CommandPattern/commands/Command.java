import Application;
import editor.Editor;

public abstract class Command implements ICommand {
    protected final Application app;
    protected final Editor editor;

    public Command(Application app, Editor editor) {
        this.app = app;
        this.editor = editor;
    }

    @Override
    public void execute() {
        saveBackup();
    }
}