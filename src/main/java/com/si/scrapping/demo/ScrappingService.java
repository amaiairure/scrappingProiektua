package com.si.scrapping.demo;

import java.util.List;

public interface ScrappingService {

    public List<Helbidea> scrap(Helbidea helbidea);

    public void save(List<Helbidea> helbideak);

    public List<Helbidea> scrapAndSave(Helbidea helbidea);

}
