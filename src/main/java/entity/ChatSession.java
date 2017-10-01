package entity;

import java.util.List;

public class ChatSession {
    private User firstUser;
    private User secondUser;
    private Language sessionLanguage;
    private List<String> chatLog;
    private boolean firstUserExit = false;
    private boolean secondUserExit = false;
}
