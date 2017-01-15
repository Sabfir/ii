package org.ayfaar.app.services.record;

import org.ayfaar.app.model.Record;

import java.util.List;
import java.util.Map;

public interface RecordService {

    void reload();

    Map<String, String> getAllUriNames();

    boolean isInternalRecordAllowed();

    Map<String, String> getAllUriCodes();

    List<Record> getAll();

    Record save(Record record);
}
