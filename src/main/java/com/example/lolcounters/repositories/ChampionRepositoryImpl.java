package com.example.lolcounters.repositories;

import com.example.lolcounters.Champion;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class ChampionRepositoryImpl implements ChampionRepository {

    private List<Champion> champions = new ArrayList<>();

    public ChampionRepositoryImpl() {
        champions.add(new Champion(1, "Aatrox", "The Darkin Blade", Arrays.asList(72,70,129,139,88),Arrays.asList(136,32,3,57,137)));
        champions.add(new Champion(2, "Ahri", "The Nine-Tailed Fox", Arrays.asList(133,98,151,7,141),Arrays.asList(11,126,62,67,3)));
        champions.add(new Champion(3, "Akali", "The Rogue Assassin", Arrays.asList(31,7,80,2,71),Arrays.asList(135,103,116,141,40)));
        champions.add(new Champion(4, "Alistar", "The Minotaur", Arrays.asList(42,14,105,69,76),Arrays.asList(104,153,146,122,87)));
        champions.add(new Champion(5, "Amumu", "The Sad Mummy", Arrays.asList(84,56),Arrays.asList(81,35,128,82,104)));
        champions.add(new Champion(6, "Anivia", "The Cryophoenix", Arrays.asList(89,7,119,31,90),Arrays.asList(114,40,99,3,136)));
        champions.add(new Champion(7, "Annie", "The Dark Child", Arrays.asList(98,80,119,30,89),Arrays.asList(126,11,151,99,3)));
        champions.add(new Champion(8, "Aphelios", "The Weapon of the Faithful", Arrays.asList(127,9,47,110,74),Arrays.asList(143,48)));
        champions.add(new Champion(9, "Ashe", "The Frost Archer", Arrays.asList(143,47,46,74),Arrays.asList(8,140,130,48,67)));
        champions.add(new Champion(10, "Aurelion Sol", "The Star Forger", Arrays.asList(66,69,52,54,17),Arrays.asList(40,6,99,103,31)));
        champions.add(new Champion(11, "Azir", "The Emperor of the Sands", Arrays.asList(136,7,2,31,141),Arrays.asList(67,3,103,126)));
        champions.add(new Champion(12, "Bard", "The Wandering Caretaker", Arrays.asList(150,7,72,77,14),Arrays.asList(50,141,104,153,114)));
        champions.add(new Champion(13, "Blitzcrank", "The Great Steam Golem", Arrays.asList(120,64,114,4,105),Arrays.asList(152,103,76,69,146)));
        champions.add(new Champion(14, "Brand", "The Burning Vengeance", Arrays.asList(72,105,146),Arrays.asList(153,104,114,102)));
        champions.add(new Champion(153, "Braum", "The Heart of Freljord", Arrays.asList(42,113,14,105,120),Arrays.asList(104,133,112,50,146)));
        champions.add(new Champion(15, "Caitlyn", "The Sheriff of Piltover", Arrays.asList(46,9,47,74),Arrays.asList(8,49,130,127)));
        champions.add(new Champion(16, "Camille", "The Steel Shadow", Arrays.asList(121,88,106,20,137),Arrays.asList(144,115,67,143,45)));
        champions.add(new Champion(17, "Cassiopeia", "The Serpent's Embrace", Arrays.asList(133,119,80,98,69),Arrays.asList(99,67,40,11,103)));
        champions.add(new Champion(18, "Cho'Gath", "The Terror of the Void", Arrays.asList(60,125,143,75,29),Arrays.asList(32,67,3,86)));
        champions.add(new Champion(19, "Corki", "The Daring Bombardier", Arrays.asList(89,40,90,31,21),Arrays.asList(11,116,103,3,6)));
        champions.add(new Champion(20, "Darius", "The Hand of Noxus", Arrays.asList(91,139,97,131,55),Arrays.asList(143,125,75,39)));
        champions.add(new Champion(21, "Diana", "Scorn of the Moon", Arrays.asList(14,31,7,98,136),Arrays.asList(103,116,90,126,67)));
        champions.add(new Champion(22, "Dr.Mundo", "The Madman of Zaun", Arrays.asList(55,145,29,131,16),Arrays.asList(70,39,99,98,136)));
        champions.add(new Champion(23, "Draven", "The Glorious Executioner", Arrays.asList(143,61,100,74),Arrays.asList(123,8,49,48,140)));
        champions.add(new Champion(24, "Ekko", "The Boy Who Shattered Time", Arrays.asList(94,5,58,31,69),Arrays.asList(104,35,116,149,11)));
        champions.add(new Champion(25, "Elise", "The Spider Queen", Arrays.asList(105,134,28,111,96),Arrays.asList(59,73,35,104,81)));
        champions.add(new Champion(26, "Evelynn", "Agony's Embrace", Arrays.asList(28,111,128,96,58),Arrays.asList(81,35,43,82,36)));
        champions.add(new Champion(27, "Ezreal", "The Prodigal Explorer", Arrays.asList(143,131,46,74,49),Arrays.asList(130,8,140,15,48)));
        champions.add(new Champion(28, "Fiddlesticks", "The Ancient Fear", Arrays.asList(111,128,84,37),Arrays.asList(104,59,63,25,65)));
        champions.add(new Champion(29, "Fiora", "The Grand Duelist", Arrays.asList(70,55,139,129,88),Arrays.asList(144,115,22,60,143)));
        champions.add(new Champion(30, "Fizz", "The Tidal Trickster", Arrays.asList(31,66,6,136),Arrays.asList(40,116,141,135,90)));
        champions.add(new Champion(31, "Galio", "The Colossus", Arrays.asList(89,98,119),Arrays.asList(3,40,11,19,116)));
        champions.add(new Champion(32, "Gangplank", "The Saltwater Scourge", Arrays.asList(99,91,18,109,70),Arrays.asList(88,3,108)));
        champions.add(new Champion(33, "Garen", "The Might of Demacia", Arrays.asList(91,55,108,121,20),Arrays.asList(144,22,44,40,95)));
        champions.add(new Champion(34, "Gnar", "The Missing Link", Arrays.asList(99,72,70,121,139),Arrays.asList(39,98,131,32,137)));
        champions.add(new Champion(35, "Gragas", "The Rabble Rouser", Arrays.asList(99,72,70,121,139),Arrays.asList(63,94,81,96)));
        champions.add(new Champion(36, "Graves", "The Outlaw", Arrays.asList(28,83,5,128,138),Arrays.asList(82,104,59,63)));
        champions.add(new Champion(37, "Hecarim", "The Shadow War", Arrays.asList(58,41,93),Arrays.asList(104,34,81,63,43)));
        champions.add(new Champion(38, "Heimerdinger", "The Revered Inventor", Arrays.asList(132,31,143,133,71),Arrays.asList(115,90,67,40,98)));
        champions.add(new Champion(39, "Illaoi", "The Kraken Priestess", Arrays.asList(96,55,145,88,121),Arrays.asList(60,104,40,32,72)));
        champions.add(new Champion(40, "Irelia", "The Blade Dancer", Arrays.asList(44,97,88,139,29),Arrays.asList(145,67,32,98,45)));
        champions.add(new Champion(41, "Ivern", "The Green Father", Arrays.asList(107,28,147,142,5),Arrays.asList(115,35,59,111,63)));
        champions.add(new Champion(42, "Janna", "The Storm's Fury", Arrays.asList(112,7,152,13),Arrays.asList(104,153,133,4,120)));
        champions.add(new Champion(43, "Jarvan IV", "The Exemplar of Demacia", Arrays.asList(5,28,142,101,73),Arrays.asList(104,96,107,84,59)));
        champions.add(new Champion(44, "Jax", "Grandmaster at Arms", Arrays.asList(70,88,18,108,106),Arrays.asList(143,40,144,32,78)));
        champions.add(new Champion(45, "Jayce", "The Defender of Tomorrow", Arrays.asList(88,145,70,18,109),Arrays.asList(99,136,143,144,44)));
        champions.add(new Champion(46, "Jhin", "The Virtuoso", Arrays.asList(100,74,23),Arrays.asList(8,127,27,67,15)));
        champions.add(new Champion(47, "Jinx", "The Loose Cannon", Arrays.asList(123,46,131,143,74),Arrays.asList(49,8,127,67,27)));
        champions.add(new Champion(48, "Kai'Sa", "Daughter of the Void", Arrays.asList(100,23,74,61,46),Arrays.asList(110,27,127,8,67)));
        champions.add(new Champion(49, "Kalista", "The Spear of Vengeance", Arrays.asList(47,100,123,61,143),Arrays.asList(140,27,127,8,67)));
        champions.add(new Champion(50, "Karma", "The Enlightened One", Arrays.asList(77,122,105,79,112),Arrays.asList(104,103)));
        champions.add(new Champion(51, "Karthus", "The Deathsinger", Arrays.asList(5,107,134,37,83),Arrays.asList(41,65,96)));
        champions.add(new Champion(52, "Kassadin", "The Void Walker", Arrays.asList(31,55,66,30,148),Arrays.asList(11,99,116,132)));
//        champions.add(new Champion(53, "Kassadin", "The Void Walker", Arrays.asList(2, 3))); -----> ZOSTAWIONE, ŻEBYM PAMIĘTAŁ DLACZEGO NIE MA ID 53
        champions.add(new Champion(54, "Katarina", "The Sinister Blade", Arrays.asList(70,30,7,31,21),Arrays.asList(116,132,40,67,99)));
        champions.add(new Champion(55, "Kayle", "The Righteous", Arrays.asList(70,45),Arrays.asList(99,32,33,39,136)));
        champions.add(new Champion(56, "Kayn", "The Shadow Reaper", Arrays.asList(5,83),Arrays.asList(104,63,96,35,51)));
        champions.add(new Champion(57, "Kennen", "The Heart of the Tempest", Arrays.asList(70,88,129,96,55),Arrays.asList(125,39,143,40,131)));
        champions.add(new Champion(58, "Kha'zix", "The Voidreaver", Arrays.asList(5,83,93,111,22),Arrays.asList(115,51,59,96,65)));
        champions.add(new Champion(59, "Kindred", "The Eternal Hunters", Arrays.asList(5,22,58,35,83),Arrays.asList(115,51,65,81,24)));
        champions.add(new Champion(60, "Kled", "The Cantankerous Cavalier", Arrays.asList(55,70,121,33,131),Arrays.asList(143,78,39,125,40)));
        champions.add(new Champion(61, "Kog'Maw", "The Mouth of the Abyss", Arrays.asList(143,46,23,74,9),Arrays.asList(130,49,8,67,48)));
        champions.add(new Champion(62, "LeBlanc", "The Deceiver", Arrays.asList(55,71,31,7,98),Arrays.asList(67,149,40,141,144)));
        champions.add(new Champion(63, "Lee Sin", "The Blind Monk", Arrays.asList(5,83,93,128,111),Arrays.asList(115,51,96,104,59)));
        champions.add(new Champion(64, "Leona", "The Radiant Dawn", Arrays.asList(12,105,150,76,42),Arrays.asList(146,13,104,102,50)));
        champions.add(new Champion(65, "Lillia", "The Bashful Bloom", Arrays.asList(5,111,83,134,58),Arrays.asList(115,81,63,138,105)));
        champions.add(new Champion(66, "Lissandra", "The Ice Witch", Arrays.asList(55,7,133,69,14),Arrays.asList(52,40,67,143,132)));
        champions.add(new Champion(67, "Lucian", "The Purifier", Arrays.asList(114,46,74,23,100),Arrays.asList(130,8,127,140,110)));
        champions.add(new Champion(68, "Lulu", "The Fae Sorceress", Arrays.asList(64,72,42,152,77),Arrays.asList(104,120,127,153,50)));
        champions.add(new Champion(69, "Lux", "The Lady of Luminosity", Arrays.asList(141,42,112,105,64),Arrays.asList(102,114,50,104,120)));
        champions.add(new Champion(70, "Malphite", "Shard of the Monolith", Arrays.asList(106,18,109,72),Arrays.asList(67,125,131,40,32)));
        champions.add(new Champion(71, "Malzahar", "The Prophet of the Void", Arrays.asList(55,24,21,114,135),Arrays.asList(132,90,67,62,11)));
        champions.add(new Champion(72, "Maokai", "The Twisted Treant", Arrays.asList(55,75,109,106),Arrays.asList(67,34,91,136,32)));
        champions.add(new Champion(73, "Master Yi", "The Wuju Bladesman", Arrays.asList(5,93,128,83,58),Arrays.asList(115,96,63,59,43)));
        champions.add(new Champion(74, "Miss Fortune", "The Bounty Hunter", Arrays.asList(143,46,114),Arrays.asList(127,8,130,123,140)));
        champions.add(new Champion(75, "Mordekaiser", "The Iron Revenant", Arrays.asList(55,131,34,44,121),Arrays.asList(39,125,22,33,72)));
        champions.add(new Champion(76, "Morgana", "The Fallen", Arrays.asList(105,72,141,150,7),Arrays.asList(104,70,92,146,4)));
        champions.add(new Champion(77, "Nami", "The Tidecaller", Arrays.asList(72,150,79,64,7),Arrays.asList(50,104,146,102,87)));
        champions.add(new Champion(78, "Nasus", "The Curator of the Sands", Arrays.asList(106,60,115,55,109),Arrays.asList(136,22,67,125,131)));
        champions.add(new Champion(79, "Nautilus", "The Titan of the Depths", Arrays.asList(120,150,105,153,64),Arrays.asList(146,50,127,152,102)));
        champions.add(new Champion(80, "Neeko", "The Curious Chameleon", Arrays.asList(149,141,135,7,76),Arrays.asList(99,133,11,21,144)));
        champions.add(new Champion(81, "Nidalee", "The Bestial Huntress", Arrays.asList(5,111,128,22,101),Arrays.asList(115,82,63)));
        champions.add(new Champion(82, "Nocturne", "The Eternal Nightmare", Arrays.asList(93,83,22,5,101),Arrays.asList(115,65,96,63,94)));
        champions.add(new Champion(83, "Nunu & Willump", "The Boy and his Yeti", Arrays.asList(5,111),Arrays.asList(115,96,35,63,24)));
        champions.add(new Champion(84, "Olaf", "The Berserker", Arrays.asList(142,43,93,83,36),Arrays.asList(138,28,35,51,44)));
        champions.add(new Champion(85, "Orianna", "The Lady of Clockwork", Arrays.asList(89,98,24,21,30),Arrays.asList(99,40,67,141,52)));
        champions.add(new Champion(86, "Ornn", "The Fire below the Mountain", Arrays.asList(88,106,55,22,108),Arrays.asList(125,67,32,96,34)));
        champions.add(new Champion(87, "Pantheon", "The Unbreakable Spear", Arrays.asList(18,145,72,60,88),Arrays.asList(131,125,129,95,67)));
        champions.add(new Champion(88, "Poppy", "Keeper of the Hammer", Arrays.asList(121,55,72,22,20),Arrays.asList(40,131,144,143,125)));
        champions.add(new Champion(89, "Pyke", "The Bloodharbor Ripper", Arrays.asList(72,70,12,64,42),Arrays.asList(104,50,133,102,141)));
        champions.add(new Champion(90, "Qiyana", "The Empress of the Elements", Arrays.asList(31,30,71,70,98),Arrays.asList(99,67,141,6,144)));
        champions.add(new Champion(91, "Quinn", "Demacia's Wings", Arrays.asList(70,72,135,22,16),Arrays.asList(32,97,136,20,33)));
        champions.add(new Champion(92, "Rakan", "The Charmer", Arrays.asList(31,150,42,12,76),Arrays.asList(104,50,87,89,153)));
        champions.add(new Champion(93, "Rammus", "The Armordillo", Arrays.asList(5,111,83,22,124),Arrays.asList(115,35,96,63,82)));
        champions.add(new Champion(94, "Rek'Sai", "The The Void Burrower", Arrays.asList(5,93,22,83,25),Arrays.asList(115,81,63,35,96)));
        champions.add(new Champion(95, "Renekton", "The Butcher of the Sands", Arrays.asList(5,93,22,83,25),Arrays.asList(125,143,97,32,40)));
        champions.add(new Champion(96, "Rengar", "The Pridestalker", Arrays.asList(5,93,83,138,101),Arrays.asList(81,59,104)));
        champions.add(new Champion(97, "Riven", "The Exile", Arrays.asList(91,70,88,129,55),Arrays.asList(144,22,40,136,145)));
        champions.add(new Champion(98, "Rumble", "The Mechanized Menace", Arrays.asList(60,145,137,39,1),Arrays.asList(32,136,45,57,20)));
        champions.add(new Champion(99, "Ryze", "The Rune Mage", Arrays.asList(133,55,7,80,141),Arrays.asList(11,66,136)));
        champions.add(new Champion(100, "Samira", "The Desert Rose", Arrays.asList(114,74,46),Arrays.asList(8,127,130,49,27)));
        champions.add(new Champion(101, "Sejuani", "Fury of the North", Arrays.asList(5,22,84,111,83),Arrays.asList(115,81,35,96,63)));
        champions.add(new Champion(102, "Senna", "The Redeemer", Arrays.asList(7,152,114,64,69),Arrays.asList(104,112,50,102)));
        champions.add(new Champion(103, "Seraphine", "The Starry-Eyed Songstress", Arrays.asList(141,72,105,12,64),Arrays.asList(104,92,50,102)));
        champions.add(new Champion(104, "Sett", "The Boss", Arrays.asList(70,55,88,106,34),Arrays.asList(143,40,144,136,32)));
        champions.add(new Champion(105, "Shaco", "The Demon Jester", Arrays.asList(5,83,93,56,128),Arrays.asList(115,81,104,59,24)));
        champions.add(new Champion(106, "Shen", "The Eye of Twilight", Arrays.asList(55,18),Arrays.asList(143,78,40,144,125)));
        champions.add(new Champion(107, "Shyvana", "The Half-Dragon", Arrays.asList(43,5,44,83,56),Arrays.asList(51,96,81,115,65)));
        champions.add(new Champion(108, "Singed", "The Mad Chemist", Arrays.asList(55,121,131,34,129),Arrays.asList(144,125,99,32,44)));
        champions.add(new Champion(109, "Sion", "The Undead Juggernaut", Arrays.asList(55,60,34,75,106),Arrays.asList(32,67,40,143,45)));
        champions.add(new Champion(110, "Sivir", "The Battle Mistress", Arrays.asList(130,131,9,15,23),Arrays.asList(8,143,127)));
        champions.add(new Champion(111, "Skarner", "The Crystal Vanguard", Arrays.asList(5,137,147,83,84),Arrays.asList(115,81,63,65,96)));
        champions.add(new Champion(112, "Sona", "Maven of the Strings", Arrays.asList(114,141,72,79,102),Arrays.asList(50,120,146,92,69)));
        champions.add(new Champion(113, "Soraka", "The Starchild", Arrays.asList(72,42,64,14,12),Arrays.asList(153,104,50,92,69)));
        champions.add(new Champion(114, "Swain", "The Noxian Grand General", Arrays.asList(141,14,77,105,120),Arrays.asList(70,104,102,4,92)));
        champions.add(new Champion(115, "Sylas", "The Unshackled", Arrays.asList(14,55,30,98,69),Arrays.asList(40,67,119,70,90)));
        champions.add(new Champion(116, "Syndra", "The Dark Sovereign", Arrays.asList(31,30,21,24,141),Arrays.asList(11,67,99,40,90)));
        champions.add(new Champion(117, "Tahm Kench", "The River King", Arrays.asList(77,102,7,105,12),Arrays.asList(104,112,13)));
        champions.add(new Champion(118, "Taliyah", "The Stoneweaver", Arrays.asList(73,107,28,138,142),Arrays.asList(51,35,104,101,115)));
        champions.add(new Champion(119, "Talon", "The Blade's Shadow", Arrays.asList(98,55,21,70,104),Arrays.asList(99,45,90,141,103)));
        champions.add(new Champion(120, "Taric", "The Shield of Valoran", Arrays.asList(42,152,68,112,12),Arrays.asList(104,79,50,89,87)));
        champions.add(new Champion(121, "Teemo", "The Swift Scout", Arrays.asList(72,70,135,55,106),Arrays.asList(131,99,67,108,22)));
        champions.add(new Champion(122, "Thresh", "The Chain Warden", Arrays.asList(42,14,105,141,76),Arrays.asList(50,146,70,104,102)));
        champions.add(new Champion(123, "Tristana", "The Yordle Gunner", Arrays.asList(114,74,100,46),Arrays.asList(140,127,49,130,8)));
        champions.add(new Champion(124, "Trundle", "The Troll King", Arrays.asList(28,142,83,134,73),Arrays.asList(51,84,96,115,94)));
        champions.add(new Champion(125, "Tryndamere", "The Barbarian King", Arrays.asList(70,131,60,16,106),Arrays.asList(98,143,40,33)));
        champions.add(new Champion(126, "Twisted Fate", "The Card Master", Arrays.asList(55,45,30,133,7),Arrays.asList(67,40,99,66,116)));
        champions.add(new Champion(127, "Twitch", "The Plague Rat", Arrays.asList(114,74,100,123,46),Arrays.asList(140,8,61,15)));
        champions.add(new Champion(128, "Udyr", "The Spirit Walker", Arrays.asList(5,83,111,58,22),Arrays.asList(81,63,142,104,51)));
        champions.add(new Champion(129, "Urgot", "The Dreadnought", Arrays.asList(55,70,139,143,106),Arrays.asList(125,144,97,57,78)));
        champions.add(new Champion(130, "Varus", "The Arrow of Retribution", Arrays.asList(74,61,100,143,46),Arrays.asList(110,8,140,49,127)));
        champions.add(new Champion(131, "Vayne", "The Night Hunter", Arrays.asList(74,100,46,9),Arrays.asList(110,127,27,143,140)));
        champions.add(new Champion(132, "Veigar", "The Tiny Master of Evil", Arrays.asList(55,70,149,141,71),Arrays.asList(99,40,114,90,143)));
        champions.add(new Champion(133, "Vel'Koz", "The Eye of the Void", Arrays.asList(105,72,89,42,79),Arrays.asList(104,102,113,103,12)));
        champions.add(new Champion(134, "Vi", "The Piltover Enforcer", Arrays.asList(5,83,137,37,111),Arrays.asList(35,51,63,96,65)));
        champions.add(new Champion(135, "Viktor", "The Machine Herald", Arrays.asList(24,98,30,31),Arrays.asList(67,99,6,40,11)));
        champions.add(new Champion(136, "Vladimir", "The Crimson Reaper", Arrays.asList(55,78,91,72,106),Arrays.asList(32,125,39)));
        champions.add(new Champion(137, "Volibear", "The Relentless Storm", Arrays.asList(55,145,131,121,34),Arrays.asList(40,143,98,144,125)));
        champions.add(new Champion(138, "Warwick", "The Uncaged Wrath of Zaun", Arrays.asList(5,83,84,111,134),Arrays.asList(96,63,59,81,24)));
        champions.add(new Champion(139, "Wukong", "The Monkey King", Arrays.asList(88,70,106,60,72),Arrays.asList(67,143,131,40,32)));
        champions.add(new Champion(140, "Xayah", "The Rebel", Arrays.asList(114,46,74,143,123),Arrays.asList(15,8)));
        champions.add(new Champion(141, "Xerath", "The Magus Ascendant", Arrays.asList(30,76,55,89,10),Arrays.asList(99,132,67,66,11)));
        champions.add(new Champion(142, "Xin Zhao", "The Seneschal of Demacia", Arrays.asList(5,93,128,111,58),Arrays.asList(115,35,59,65,63)));
        champions.add(new Champion(143, "Yasuo", "The Unforgiven", Arrays.asList(55,95,71,30,7),Arrays.asList(99,67,40,126,103)));
        champions.add(new Champion(144, "Yone", "The Unforgotten", Arrays.asList(55,7,70,30,95),Arrays.asList(11,136,40,99,67)));
        champions.add(new Champion(145, "Yorick", "Sheperd of Souls", Arrays.asList(106,40,91,55,72),Arrays.asList(32,143,136,98,45)));
        champions.add(new Champion(146, "Yuumi", "The Magical Cat", Arrays.asList(4,64,79,122,42),Arrays.asList(50,133,103)));
        champions.add(new Champion(147, "Zac", "The Secret Weapon", Arrays.asList(5,83,56,37,134),Arrays.asList(115,44,81,96,35)));
        champions.add(new Champion(148, "Zed", "The Master of Shadows", Arrays.asList(55,70,30,98,24),Arrays.asList(99,40,67,52,6)));
        champions.add(new Champion(149, "Ziggs", "The Hexplosives Expert", Arrays.asList(55,24,31,62,135),Arrays.asList(11,132,103,67,151)));
        champions.add(new Champion(150, "Zilean", "The Chronokeeper", Arrays.asList(141,152,31,14),Arrays.asList(104,92,146,153,50)));
        champions.add(new Champion(151, "Zoe", "The Ascpect of Twilight", Arrays.asList(55,149,7,31,89),Arrays.asList(40,99,90,11,17)));
        champions.add(new Champion(152, "Zyra", "Rise of the Thorns", Arrays.asList(31,105,141,79),Arrays.asList(153,102,120,104)));
    }

    @Override
    public Champion getChampionById(Integer id) {
        Optional<Champion> champion = champions.stream().filter(c -> c.getId().equals(id)).findFirst();
        if (champion.isPresent()) {
            return champion.get();
        } else {
            return null;
        }
    }

    @Override
    public List<Champion> getAllChampions() {
        return champions;
    }
}
