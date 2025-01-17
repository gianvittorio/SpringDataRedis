package com.gianvittorio.service;

import com.gianvittorio.model.entity.Programmer;
import com.gianvittorio.model.repository.ProgrammerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class ProgrammerServiceImpl implements ProgrammerService {
    @Autowired
    private ProgrammerRepository repository;

    @Override
    public void setProgrammerAsString(String idKey, String programmer) {
        repository.setProgrammerAsString(idKey, programmer);
    }

    @Override
    public String getProgrammerAsString(String idKey) {
        return repository.getProgrammerAsString(idKey);
    }

    @Override
    public void addToProgrammerList(Programmer programmer) {
        repository.addToProgrammerList(programmer);
    }

    @Override
    public List<Programmer> getProgrammerListMembers() {
        return repository.getProgrammerListMembers();
    }

    @Override
    public Long getProgrammerListCount() {
        return repository.getProgrammerListCount();
    }

    @Override
    public void addToProgrammerSet(Programmer... programmers) {
        repository.addToProgrammerSet(programmers);
    }

    @Override
    public Set<Programmer> getProgrammerSetMembers() {
        return repository.getProgrammerSetMembers();
    }

    @Override
    public boolean isSetMember(Programmer programmer) {
        return repository.isSetMember(programmer);
    }

    @Override
    public void saveHash(Programmer programmer) {
        repository.saveHash(programmer);
    }

    @Override
    public void updateHash(Programmer programmer) {
        repository.updateHash(programmer);
    }

    @Override
    public Map<Integer, Programmer> findAllHash() {
        return repository.findAllHash();
    }

    @Override
    public Programmer findInHash(int id) {
        return repository.findInHash(id);
    }

    @Override
    public void deleteHash(int id) {
        repository.deleteHash(id);
    }
}
