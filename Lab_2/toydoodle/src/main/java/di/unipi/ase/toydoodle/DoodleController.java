package di.unipi.ase.toydoodle;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class DoodleController {
    // counts the opened doodles
    private int id = 0;
    // keeps track of the currenty open doodles as couples <id, Doodle>
    private HashMap<Integer, Doodle> doodles = new HashMap<>();

    @RequestMapping(value = "/doodles/{id}/vote", method = RequestMethod.PUT)
    public String addVote(@PathVariable("id") int id, @RequestBody Vote v) {
        return doodles.get(id).addVote(v);
    }

    @RequestMapping(value = "/doodles/{id}/vote/{name}", method = RequestMethod.POST)
    public String changeOption(@PathVariable("id") int id, @PathVariable("name") String name, @RequestBody Vote v) {
        Doodle doodle = doodles.get(id);

        doodle.removeVote(name);
        return doodle.addVote(v);
    }

    @RequestMapping(value = "/doodles", method = RequestMethod.PUT)
    public long createDoodle(@RequestBody Doodle d) {
        doodles.put(id, new Doodle(d));
        return id++;
    }

    @RequestMapping(value = "/doodles/{id}", method = RequestMethod.DELETE)
    public void deleteDoodle(@PathVariable("id") int id) {
        doodles.remove(id);
    }

    @RequestMapping(value = "/doodles/{id}/vote/{name}", method = RequestMethod.DELETE)
    public void deleteVote(@PathVariable("id") int id, @PathVariable("name") String name) {
        doodles.get(id).removeVote(name);
    }

    @RequestMapping(value = "/doodles/{id}", method = RequestMethod.GET)
    public Doodle getDoodle(@PathVariable("id") int id) {
        return doodles.get(id);
    }

    @RequestMapping(value = "/doodles", method = RequestMethod.GET)
    public HashMap<Integer, Doodle> getOpenDoodles() {
        return doodles;
    }

    @RequestMapping(value = "/doodles/{id}/vote/{name}", method = RequestMethod.GET)
    public String getChosenOption(@PathVariable("id") int id, @PathVariable("name") String name) {
        return doodles.get(id).findPreviousVote(name);
    }
}
