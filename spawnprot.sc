__apply_inv()->
(
    sleep(1000)
    modify(player(), 'effect', 'minecraft:resistance', 60*20, 4, false, true, true);
    print(player(), format('q You are now invulnerable for ', 'c 1 minute', 'q .'));
);


__on_player_respawns(player)->
(
    task('__apply_inv');
);