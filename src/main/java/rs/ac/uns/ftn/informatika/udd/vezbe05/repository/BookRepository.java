package rs.ac.uns.ftn.informatika.udd.vezbe05.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import rs.ac.uns.ftn.informatika.udd.vezbe05.lucene.model.IndexUnit;

public interface BookRepository extends ElasticsearchRepository<IndexUnit, String> {

	List<IndexUnit> findByTitle(String title);

	IndexUnit findByFilename(String filename);
}
