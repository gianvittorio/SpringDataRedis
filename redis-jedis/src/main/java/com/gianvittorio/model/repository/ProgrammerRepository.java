package com.gianvittorio.model.repository;

import com.gianvittorio.model.entity.Programmer;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ProgrammerRepository {
    void setProgrammerAsString(String idKey, String programmer);

    String getProgrammerAsString(String idKey);

    void addToProgrammerList(Programmer programmer);

    List<Programmer> getProgrammerListMembers();

    Long getProgrammerListCount();

    void addToProgrammerSet(Programmer... programmers);

    Set<Programmer> getProgrammerSetMembers();

    boolean isSetMember(Programmer programmer);

    void saveHash(Programmer programmer);

    void updateHash(Programmer programmer);

    Map<Integer, Programmer> findAllHash();

    Programmer findInHash(int id);

    void deleteHash(int id);

}
