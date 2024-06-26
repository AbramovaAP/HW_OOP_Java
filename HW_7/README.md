Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
Соблюдать принципы SOLID, паттерны проектирования.
Можно выбрать другой язык программирования, например C# или Python, если выбран язык, отличный от JAVA, то необходимо написать документ, каким образом можно запустить приложение (что необходимо установить, каким образом запускать и т.п.).

Формат сдачи: ссылка на гитхаб проект

Данная промежуточная аттестация оценивается по системе "зачет" / "не зачет".

Оценка “Зачтено” ставится, если Задание выполнено на 65% и более и предоставлено в срок и в комфортном для обзора формате
Оценка “Незачтено” выставляется, если выполнено менее 65% проекта, сдан пустой файл, битая ссылка, нерелевантное содержимое присланного.

**Алгебраические операции над комплексными числами:**   
Для наглядности формулы рассчитаны из данных, которые используются в файле Main.java   
1. Сложение комплексных чисел:  
    (a + bi) + (c + di) = (a + c) + (b + d)i  

    (2 + 5i) + (3 + 4i) = (2 + 3) + (5 + 4)i = **5 + 9i**  

2. Вычитание комплексных чисел:  
    (a + bi) − (c + di) = (a − c) + (b − d)i  

    (2 + 5i) – (3 + 4i) = (2 – 3) + (5 – 4)i = **-1 + 1i**  

3. Умножение комплексных чисел:  
    (a + bi) * (c + di) = (a + bi) * c + (a + bi) * di  
        = (ac + bci)+(adi + bdi^2) = (ac + bci)+(adi - bd)   
        = (ac − bd) + (bc + ad)i   

    (2 + 5i) ∗ (3 + 4i) = (6 + 15i) + (8i + 20i^2)  
        = 6 + 23i − 20  
        = **-14 + 23i**   

4. Деление комплексных чисел:  
    (a + bi) / (c + di) = ((a + bi)*(c - di)) / ((c + di)*(c - di))
        = ((ac+bd)+(bc-ad)i) / (с^2+d^2)
        = ((ac+bd)/(с^2+d^2)) + ((bc-ad)/(с^2 +d^2))i 

    (2 + 5i) / (3 + 4i) = ((2 + 5i)*(3 - 4i)) / ((3 + 4i)*(3 - 4i))
        = ((6+20)+(15-8)i) / (9+16)
        = ((6+20)/(9+16)) + ((15-8)/(9 +16))i   
        = 26/25 + (7/25)i   
        = **1.04 + 0.28i**