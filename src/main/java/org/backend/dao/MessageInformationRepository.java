package org.backend.dao;

import org.backend.entities.MessageInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageInformationRepository extends JpaRepository<MessageInformation, Long> {

}
