#!/bin/bash

VERSIONS=('2.5' '2.6' '2.7' '2.8' '2.9');

TIMESTAMP=`ls packaging/org.eclipselabs.emf.loophole-repository/2.5/target/repository/plugins/org.eclipselabs.emf.loophole_* \
		| grep -v '_.*_.*' | cut -d'/' -f7 | cut -d'.' -f7`

for v in ${VERSIONS[@]}; do
	echo "Copying build" ${v}"-"${TIMESTAMP}
	mkdir -p ${v}/${TIMESTAMP}/
	cp -rf packaging/org.eclipselabs.emf.loophole-repository/${v}/target/repository/* ${v}/${TIMESTAMP}/
	
	./comp-repo.sh ${v} \
		--name "EMF Loophole releases repository for EMF ${v}" \
		--eclipse '/Applications/eclipse 3.8.2' \
		add ${TIMESTAMP}/

	thisFolder=`pwd`
	./comp-repo.sh ${thisFolder} \
		--name "EMF Loophole releases repository" \
		--eclipse '/Applications/eclipse 3.8.2' \
		add ${v}/${TIMESTAMP}/
done

git add 2.*
git add composite*.jar
git commit -m "added build ${TIMESTAMP}"
