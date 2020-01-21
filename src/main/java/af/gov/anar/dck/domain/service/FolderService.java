package af.gov.anar.dck.domain.service;

import af.gov.anar.dck.domain.model.Folder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

@Service
public interface FolderService {
    public List<Folder> getRootFolder();

    public List<Folder> findAllSubFolders(Long folderId);

    public List<Folder> createNewFolder(String name, Long parentId);

    public List<Folder> uploadFile(Long parentId, MultipartFile mf);
   
    public File findFile(Long id) throws Exception;

}