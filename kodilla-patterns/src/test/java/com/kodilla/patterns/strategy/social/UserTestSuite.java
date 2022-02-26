package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTestSuite {
    @Test
    void testDefaultSharingStrategies(){
        //given
        User user1 = new Millenials("user1 millenials");
        User user2 = new YGeneration("user2 Ygeneration");
        User user3 = new ZGeneration("user3 Zgeneration");

        //when
        String user1Social = user1.sharePost();
        System.out.println("User 1 " + user1Social);
        String user2Social = user2.sharePost();
        System.out.println("User 2 " + user2Social);
        String user3Social = user3.sharePost();
        System.out.println("User 3 " + user3Social);

        //then
        assertEquals("Facebook", user1Social);
        assertEquals("Twitter", user2Social);
        assertEquals("Snapchat", user3Social);

    }
    @Test
    void testIndividualSharingStrategy(){
        //given
        User user1 = new Millenials("user1 millenials");

        //when
        String user1Social = user1.sharePost();
        System.out.println("User 1 " + user1Social);
        user1.setSocialPublisher(new FacebookPublisher());
        user1Social = user1.sharePost();
        System.out.println("User 1 now: " + user1Social);

        //then
        assertEquals("Facebook", user1Social);
    }
}
