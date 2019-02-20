package org.backend.dao;

import org.backend.entities.ExtractionInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExtractionInfoRepository extends JpaRepository<ExtractionInfo, Long> {

}
