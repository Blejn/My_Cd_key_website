package pl.projekt.service;

import org.springframework.stereotype.Service;
import pl.projekt.customers.CdKey;
import pl.projekt.dto.CdKeyDto;
import pl.projekt.repository.CdKeyRepository;
@Service
public class CdKeyService {
    private CdKeyRepository cdKeyRepository;
    public CdKeyService(CdKeyRepository cdKeyRepository){
        this.cdKeyRepository=cdKeyRepository;
    }
    public  void add(CdKeyDto cdKeyDto){
        CdKey newCdKey= new CdKey();
        newCdKey.setTitle(cdKeyDto.getTitle());

        cdKeyRepository.save(newCdKey);
    }

}
