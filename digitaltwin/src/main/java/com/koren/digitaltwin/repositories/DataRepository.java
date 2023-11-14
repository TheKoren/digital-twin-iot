package com.koren.digitaltwin.repositories;

import com.koren.digitaltwin.models.message.Message;
import com.koren.digitaltwin.models.message.WifiMessage;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DataRepository extends MongoRepository<WifiMessage, ObjectId> {
    Optional<WifiMessage> findMessageByMac(String mac);

    List<Message> findMessagesByMac(String mac);
}
