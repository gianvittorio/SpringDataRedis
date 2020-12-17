package com.gianvittorio.resource;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gianvittorio.model.entity.Programmer;
import com.gianvittorio.service.ProgrammerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/api/v1")
public class ProgrammerController {
    @Autowired
    private ProgrammerService service;

    @PostMapping(
            value = "/programmer-string",
            consumes = "application/json"
    )
    @ResponseStatus(HttpStatus.CREATED)
    public void addTopic(@RequestBody Programmer programmer) throws JsonProcessingException {
        service.setProgrammerAsString(
                Integer.toString(programmer.getId()),
                new ObjectMapper().writeValueAsString(programmer)
        );
    }

    @GetMapping(
            value = "/programmer-string/{id}",
            produces = "application/json"
    )
    @ResponseStatus(HttpStatus.OK)
    public String readString(@PathVariable String id) {
        return service.getProgrammerAsString(id);
    }

    @GetMapping(
            value = "/programmers-list",
            produces = "application/json"
    )
    @ResponseStatus(HttpStatus.OK)
    public List<Programmer> getProgrammerListMembers() {
        return service.getProgrammerListMembers();
    }

    @GetMapping("/programmers-list/count")
    @ResponseStatus(HttpStatus.OK)
    public Long getProgrammerListCount() {
        return getProgrammerListCount();
    }

    @PostMapping(
            value = "/programmers-list",
            consumes = "application/json"
    )
    @ResponseStatus(HttpStatus.CREATED)
    public void addToProgrammerList(@RequestBody Programmer programmer) {
        service.addToProgrammerList(programmer);
    }

    @PostMapping(
            value = "/programmers-set",
            consumes = "application/json"
    )
    @ResponseStatus(HttpStatus.CREATED)
    public void addToProgrammerSet(@RequestBody Programmer... programmers) {
        service.addToProgrammerSet(programmers);
    }

    @GetMapping(
            value = "/programmers-set",
            produces = "application/json"
    )
    @ResponseStatus(HttpStatus.OK)
    public Set<Programmer> getProgrammerSetMembers() {
        return service.getProgrammerSetMembers();
    }

    @GetMapping(value = "/programmers-set/member", consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public boolean isSetMember(@RequestBody Programmer programmer) {
        return service.isSetMember(programmer);
    }

    @PostMapping(
            value = "/programmers-hash",
            consumes = "application/json"
    )
    @ResponseStatus(HttpStatus.CREATED)
    public void savePHash(@RequestBody Programmer programmer) {
        service.saveHash(programmer);
    }

    @PutMapping(
            value = "/programmers-hash",
            consumes = "application/json"
    )
    @ResponseStatus(HttpStatus.OK)
    public void updateHash(@RequestBody Programmer programmer) {
        service.updateHash(programmer);
    }

    @GetMapping(
            value = "/programmers-hash",
            produces = "application/json"
    )
    @ResponseStatus(HttpStatus.OK)
    public Map<Integer, Programmer> findALlPHash() {
        return service.findAllHash();
    }

    @GetMapping(
            value = "/programmers-hash/{id}",
            produces = "application/json"
    )
    @ResponseStatus(HttpStatus.OK)
    public Programmer findPInHash(@PathVariable int id) {
        return service.findInHash(id);
    }
}
