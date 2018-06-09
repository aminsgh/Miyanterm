package aut.company;

import java.io.IOException;

public interface IDownloadingBtn {
    void downloadClicked(MyFile file) throws IOException, ClassNotFoundException;
}
