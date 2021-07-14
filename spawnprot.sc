__on_player_respawns(player)->
(
    modify(player, 'effect', 'minecraft:resistance', 60*20, 4, false, true, true);
    print(player, format('q You are now invulnerable for ', 'c 1 minute', 'q .'))
)