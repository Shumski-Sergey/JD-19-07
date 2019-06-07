package inikalayeva.Lesson4;

public class TaskB1 {
    public static void main(String[] args){
        String tolstoy = "...На краю дороги стоял дуб. Он был, вероятно, в десять раз старше берез, составлявших лес, в десять раз толще и в два раза выше каждой березы. Это был огромный, в два обхвата дуб, с обломанными суками и корой, заросшей старыми болячками. С огромными, неуклюже, несимметрично растопыренными корявыми руками и пальцами, он старым, сердитым и презрительным уродом стоял между улыбающимися березами. Только он один не хотел подчиниться обаянию весны и не хотел видеть ни весны, ни солнца. Этот дуб как будто говорил: «Весна, и любовь, и счастье! И как не надоест вам все один и тот же глупый, бессмысленный обман! Все одно и то же, и все обман! Нет ни весны, ни солнца, ни счастья. Вон смотрите, сидят задавленные мертвые ели, всегда одинокие, и вон я растопырил свои обломанные, ободранные пальцы, выросшие из спины, из боков — где попало. Как выросли — так и стою, и не верю вашим надеждам и обманам». Князь Андрей несколько раз оглянулся на этот дуб, проезжая по лесу. Цветы и трава были и под дубом, но он все так же, хмурый, неподвижный, уродливый и упорный, стоял посреди них. «Да, он прав, тысячу раз прав этот дуб, — думал князь Андрей. — Пускай другие, молодые, вновь поддаются на этот обман, а мы знаем: наша жизнь кончена!» Целый ряд мыслей, безнадежных, но грустно-приятных, в связи с этим дубом возник в душе князя Андрея. Во время этого путешествия он как будто вновь обдумал всю свою жизнь и пришел к тому же успокоительному и безнадежному заключению, что ему начинать ничего было не надо, что он должен доживать свою жизнь, не делая зла, не тревожась и ничего не желая... Уже было начало июня, когда князь Андрей, возвращаясь домой, въехал опять в ту березовую рощу, в которой этот старый, корявый дуб так странно и памятно поразил его. «Здесь, в этом лесу, был этот дуб, с которым мы были согласны. Да где он?» — подумал князь Андрей, глядя на левую сторону дороги. Сам того не зная, он любовался тем дубом, которого искал, но теперь не узнавал его. Старый дуб, весь преображенный, раскинувшись шатром сочной, темной зелени, млел, чуть колыхаясь в лучах вечернего солнца. Ни корявых пальцев, ни болячек, ни старого горя и недоверия — ничего не было видно. Сквозь столетнюю жесткую кору пробивались без сучков сочные, молодые листья, так что верить нельзя было, что это старик произвел их. «Да это тот самый дуб», — подумал князь Андрей, и на него вдруг нашло беспричинное весеннее чувство радости и обновления. Все лучшие минуты его жизни вдруг в одно и то же время вспомнились ему. И Аустерлиц с высоким небом, и Пьер на пароме, и девочка, взволнованная красотою ночи, и эта ночь, и луна — все это вдруг вспомнилось ему.«Нет, жизнь не кончена в тридцать один год, — вдруг окончательно и бесповоротно решил князь Андрей. — Мало того, что я знаю все то, что есть во мне, надо, чтобы и все знали это: и Пьер, и эта девочка, которая хотела улететь в небо. Надо, чтобы не для одного меня шла моя жизнь, чтобы на всех она отражалась и чтобы все они жили со мной вместе».";
        char[] warAndPeace = tolstoy.toCharArray();
        StringBuffer strBuffer = new StringBuffer("String Buffer starts: ");
        long stringBufferStart = System.currentTimeMillis();
        for (int i = 0; i < warAndPeace.length; i++){
            strBuffer.append(warAndPeace[i]);
            strBuffer.append(" ");
        }
        long stringBufferFinish = System.currentTimeMillis();
        long stringBufferTime = stringBufferFinish - stringBufferStart;

        long stringBuilderStart = System.currentTimeMillis();
        StringBuilder strBuilder = new StringBuilder("String Builder starts: ");
        for (int i = 0; i < warAndPeace.length; i++){
            strBuilder.append(warAndPeace[i]);
            strBuilder.append(" ");
        }
        long stringBuilderFinish = System.currentTimeMillis();
        long stringBuilderTime = stringBuilderFinish - stringBuilderStart;


        if (stringBufferTime > stringBuilderTime){
            System.out.println("StriingBuffer is "
                    + stringBufferTime / stringBuilderTime + " times slower than StringBuilder");
        }
        else {
            System.out.println("StriingBuilder is "
                    + stringBuilderTime / stringBufferTime + " times slower than StringBuffer");
        }

    }
}