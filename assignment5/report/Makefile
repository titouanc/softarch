FIGURES = $(subst .dia,.eps,$(wildcard *.dia)) $(wildcard *.png)

Antoine-Carpentier_Titouan-Christophe_5.pdf: main.pdf
	cp $< $@

main.pdf: main.tex report.tex ${FIGURES}
	pdflatex $<
	pdflatex $<

%.eps: %.dia
	dia -e $@ $<