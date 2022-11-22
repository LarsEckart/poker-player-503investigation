package org.leanpoker.player;

import com.fasterxml.jackson.databind.JsonNode;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class Player {

    private static final Logger log = getLogger(Player.class);

    static final String VERSION = "bet 15";

    public static int betRequest(JsonNode request) {
        int bet = 15;
        log.info("betting " + bet);
        return bet;
    }

    public static void showdown(JsonNode game) {
    }
}
